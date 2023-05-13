package Group2.capstone_project.dto.client;

import org.springframework.security.crypto.password.PasswordEncoder;

public class ClientDto {

    private final PasswordEncoder passwordEncoder;

    public ClientDto(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private String id;
    private String name;
    private String age;
    private String studentNumber;
    private String password;

    private String school;
    private String email;
    private String department;

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    private String Leader;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber (String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
