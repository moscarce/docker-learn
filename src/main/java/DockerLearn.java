import java.util.Objects;

public class DockerLearn{
    public String message;

    public DockerLearn(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DockerLearn{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DockerLearn that)) return false;
        return Objects.equals(getMessage(), that.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage());
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
