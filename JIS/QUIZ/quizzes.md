# TESTING
# Quizzes for CS Year 2

Quiz#4
```.java
public class checker{

    boolean test = false;

    public checker(String add) {
        String[] parts = add.split("\\.");

        test = parts.length == 4;

        if (test) {
            for (int i = 0; i < 4; i++){
                int number = castInteger(parts[i]);

                if (0 <= number && number <= 255) {
                } else {
                    test = false;
                }
            }
        }
    }

    private int castInteger(String S) {
        try {
            return Integer.parseInt(S);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
```

## Proof of work:
<img width="336" height="69" alt="Screenshot 2026-08-27 at 12 40 57" src="https://github.com/user-attachments/assets/b6745e76-1380-4dbe-afa7-3d9164e780a3" />



## Markdown files
