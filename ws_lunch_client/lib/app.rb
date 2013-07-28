require 'net/http'
require 'nokogiri'
require 'open-uri'
require 'pry'

@base_url = 'http://127.0.0.1:8080'

def fetch_restaurants
  Nokogiri::XML(open("#{@base_url}/service"))
end

if ARGV[0] == 'list'
  service = fetch_restaurants.children.first
  service.children.each do |restaurant|
    puts "  #{restaurant.attributes['name']} (#{restaurant.attributes['type']}) -- #{restaurant.attributes['description']}"
    restaurant.children.each do |meal|
      puts "  \t#{meal.attributes['name']} -- #{meal.attributes['cost']} #{meal.attributes['description']}"
    end
  end
elsif ARGV[0] == 'order'
  if ARGV[1].nil? or ARGV[2].nil? or ARGV[3].nil?
    puts 'Usage: ruby app.rb order [name] [restaurant ordinal] [meal ordinal]'
  else
    url = URI.parse('http://localhost:8080/order')
    params = {name: ARGV[1], restaurant: ARGV[2], meal: ARGV[2]}
    resp, data = Net::HTTP.post_form(url, params)
    puts resp.body
  end
else
  puts 'Commands:'
  puts 'list -- List the restaurants and meals availible'
  puts 'order -- Order a meal from a restaurant'
end