public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
//        System.out.println(goalParser(command));
    }

    public static String interpret(String command) {
        command.replace("()","o");
        command.replace("(al)", "al");
        return command;
    }

//    public static String goalParser(String command) {
//        String str = " ";
////        int i = 0;
////        while( i < command)
////            command.
//    }
}
