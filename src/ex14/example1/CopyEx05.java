package ex14.example1;

import java.time.LocalDateTime;

class JoinDTO{
    private String username; // ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


}


class Member{
    private int no; // 만들어 내야하는 데이터
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 회원가입 된 시간

    public Member(int no, JoinDTO d) {
        this.no = no;
        this.username = d.getUsername();
        this.password = d.getPassword();
        this.email = d.getEmail();
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

//        LocalDateTime now = LocalDateTime.now();
//        now.plusDays(1);
//        System.out.println(now);

        // 객체 복사 방법
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d1);

        JoinDTO d = new JoinDTO(d1.getUsername(), d1.getPassword(), d1.getEmail());


        //System.out.println(d1);  // 기존 JoinDTO 객체
        System.out.println(m2);  // Member 객체
        //System.out.println(d);  // 새로운 JoinDTO 객체

    }
}
