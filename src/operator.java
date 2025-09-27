//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class operator {
    public static void main(String[] args) {
        int a = 20, b = 30;
        String res = (a > b )? "Yes":"No";
        System.out.println(res);

        int aa=30, bb=10, cc=-90;
        int res1 = (aa>bb)?((aa>cc) ? aa : cc): ((bb>cc)? bb : cc);
        System.out.println(res1);
    }}