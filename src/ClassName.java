import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
//Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//Không chứa các ký tự đặc biệt
//Theo sau ký tự bắt đầu là 4 ký tự số
//Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
public class ClassName {
    public final String CLASS_REGEX = "^[CAP][\\d]{4}[GHIKLMN]$";
    public ClassName(){
    }
    public boolean validate(String className){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(className);
        boolean isValid = matcher.matches();
        return isValid;
    }

}
