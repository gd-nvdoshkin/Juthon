import org.python.core.PyString;
import org.python.util.PythonInterpreter;

public class Solution {
    public static void main(String[] args) {
        Long before = System.currentTimeMillis();

        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        pythonInterpreter.set("value", new PyString("Hi"));
        pythonInterpreter.execfile("demo.py");
        String result = pythonInterpreter.get("result", String.class);
        Long after = System.currentTimeMillis();

        System.out.println(result);
        System.out.println("Execution time: " + (after - before));
    }
}
