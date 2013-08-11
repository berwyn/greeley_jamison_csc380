package service;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 06/08/13
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 */
public class State {
    private String fullname;
    private String twoDigitCode;

    public State() {
    }

    public State(String fullname, String twoDigitCode) {
        this.fullname = fullname;
        this.twoDigitCode = twoDigitCode;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTwoDigitCode() {
        return twoDigitCode;
    }

    public void setTwoDigitCode(String twoDigitCode) {
        this.twoDigitCode = twoDigitCode;
    }
}
