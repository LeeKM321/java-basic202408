package etc.exception.throws_;

import etc.exception.custom.InvalidLoginInputException;

public class LoginUser {

    private String account; // 가입 시 계정명
    private String password; // 가입 시 비밀번호

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public static final boolean SUCCESS = true;
    public static final boolean LOGIN_FAIL = false;

    // 로그인 검증

    public void loginValidate(String inputAccount, String inputPassword)
        throws Exception {
        idValidate(inputAccount);
        pwValidate(inputPassword);
    }

    private void idValidate(String account) throws Exception {
        if (!account.equals(this.account)) {
            throw new InvalidLoginInputException("아이디가 일치하지 않습니다.");
        }
        System.out.println("메롱");
    }

    private void pwValidate(String password) throws Exception {
        if (!password.equals(this.password)) {
            throw new InvalidLoginInputException("비밀번호가 틀렸습니다.");
        }
    }


}













