package enums;

public enum USER_INFO {
   CLIENT("hypnotes2022cl2@gmail.com","Aydinlik123/"),
    THERAPIST("hypnotes2022tr1@gmail.com","Aydinlik123/");

    private final String email;
    private final String password;

    USER_INFO(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
