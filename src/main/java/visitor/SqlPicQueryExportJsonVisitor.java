package visitor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import grammar.picsqlBaseVisitor;
import grammar.picsqlLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SqlPicQueryExportJsonVisitor extends picsqlBaseVisitor<JsonNode> {

    private ObjectMapper objectMapper = new ObjectMapper();
    private picsqlLexer picsqlLexer;

    public SqlPicQueryExportJsonVisitor(picsqlLexer picsqlLexer) {
    this.picsqlLexer = picsqlLexer;
    }

    @Override
    public JsonNode visit(ParseTree tree) {
        JsonNode node = objectMapper.createObjectNode();
        ObjectNode objectNode = (ObjectNode) node;

        ArrayNode children = objectNode.putArray("children");
        for(int i =0; i < tree.getChildCount(); i++){
            ParseTree child = tree.getChild(i);
            if(child instanceof TerminalNode terminalNode){
                children.add(visitTerminal(terminalNode));
            }else{
                children.add(visit(child));
            }
        }
        return objectNode;
    }

    @Override
    public JsonNode visitTerminal(TerminalNode node) {
        return  objectMapper.createObjectNode()
                .put("name", node.getText())
                .put("type", picsqlLexer.getVocabulary().getSymbolicName(node.getSymbol().getType()))
                .put("start", node.getSymbol().getStartIndex())
                .put("stop", node.getSymbol().getStopIndex())
                ;

    }
}