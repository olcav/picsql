public class Main {
  public static void main(String[] args) {
    if (args.length > 0) {
      String sql = args[0];
      String output = args[1];
      String filename = "";
      System.out.println("Start executing " + sql + "...");
      if (output != null && output.contains(".")) {
        filename = output.substring(output.lastIndexOf(".") + 1);
      } else {
        System.out.println(
            "No file format detected, verify your file path (need to be a bmp picture)");
      }
      SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
      sqlPicQueryParser.parseToWriteImage(sql, output, filename);
      System.out.println("Query executed ! Output picture : " + output);
    } else {
      System.out.println("Use like this : picsql.jar \"sql_query\" \"output_file_path\"");
    }
  }
}
