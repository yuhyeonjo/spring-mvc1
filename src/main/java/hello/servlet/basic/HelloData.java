package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * JSON 형식 파싱 추가
 * - JSON 형식은 보통 객체로 바꿔서 씀
 */

@Getter
@Setter
public class HelloData {

    private String username;
    private int age;

    /**
     * lombok getter, setter 사용
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     */
}
