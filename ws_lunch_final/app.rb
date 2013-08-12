require 'savon'
require 'pry'

client = Savon.client(wsdl: 'http://localhost:8080/services/lunch/lunch?wsdl')
service = client.call(:get_menu)
binding.pry