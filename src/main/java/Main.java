public class Main {
  public static void main(String[] args) {
    if (args.length > 0) {
      String sql = args[0];
      String output = args[1];
      String filename = "";
      if (output != null && output.contains(".")) {
        filename = output.substring(output.lastIndexOf(".") + 1);
      }
      SqlPicQueryParser sqlPicQueryParser = new SqlPicQueryParser();
      sqlPicQueryParser.parseToWriteImage(sql, output, filename);
    } else {
      System.out.println("Use like this : picsql.kar \"sql_query\" \"output_file_path\"");
    }
  }
}
