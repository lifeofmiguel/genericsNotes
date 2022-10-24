import java.util.ArrayList;
import java.util.List;
/*
before generics there was no way to tell java that a list
only contains strings you could only create lists that could
contain any sort of object

to get a string back out of the list you would need
to cast the object to string to be able to work with it
 */

public class Main{
    private final String first;
    private final String second;

    public Main(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Main{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }
}





/*
SQL NOTES
SQL is not a case-sensitive language.
In MySQL, every statement must be terminated with a semicolon.
—- This is a comment and it won’t get executed

SELECT *
FROM customers
WHERE state = ‘MD’
ORDER BY first_name
LIMIT 3;

—- Removing duplicates
SELECT DISTINCT state
FROM customers

Greater than: >
Greater than or equal to: >=
Less than: <
Less than or equal to: <=
Equal: =
Not equal: <>
Not equal: !=

 */