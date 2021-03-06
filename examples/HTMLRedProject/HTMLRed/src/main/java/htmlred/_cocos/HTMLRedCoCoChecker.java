/* generated from model null*/
/* generated by template cocos.CoCoChecker*/



package htmlred._cocos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.LinkedHashSet;

import htmlred._ast.ASTHTMLRedNode;
import htmlred._visitor.HTMLRedVisitor;
import htmlred._visitor.HTMLRedInheritanceVisitor;

/**
 * This class is capable of checking context conditions of the language and all
 * their super languages. Beside such composition of single context conditions
 * ({@code addCoCo(...)}) it also allows composing of existing checkers of
 * the language itself and checkers of (transitive) super languages
 * ({@code addChecker(...)}). Composing multiple checkers of the same (super)
 * language is possible. The composed checkers are not modified. Also it is
 * supported to mix both composing existing checkers as well as single.<br/>
 * <b>Keep in mind</b> that context conditions are executed multiple-times if
 * added multiple times. This might be tricky when multiple composed checkers
 * hold the same context condition.<br/>
 * <br/>
 * <b>Add context conditions</b> using {@code #addCoCo(...}.<br/>
 * <br/>
 * <b>Add checkers</b> using {@code #addCoCo(...}.<br/>
 * <br/>
 * <b>Execute all</b> registered context conditions and checkers by calling
 * {@link #checkAll(ASTHTMLRedNode)}.
 * 
 * @author Robert Heim
 */
public class HTMLRedCoCoChecker implements HTMLRedInheritanceVisitor {

  public HTMLRedCoCoChecker() {
  }

  // --- realThis-Pattern ---
  
  private HTMLRedVisitor realThis = this;

  @Override
  public HTMLRedVisitor getRealThis() {
    return realThis;
  }

  @Override
  public void setRealThis(HTMLRedVisitor realThis) {
    this.realThis = realThis;
  }
  
  // --- /realThis-Pattern ---

    /**
     * Executes all registered context conditions and checkers on the given ast.
     * @param node the node to check the context conditions on.
     */
    public void checkAll(ASTHTMLRedNode node) {
      // start the double-dispatch visitor
      // checks are performed in the visit methods.
      node.accept(getRealThis());
    }


      private List<htmlred._cocos.HTMLRedCoCoChecker> htmlred__cocos_HTMLRedCoCoChecker = new ArrayList<>();

    /**
     * Registers a checker whose context conditions will be executed once the
     * checker runs.<br/>
     * <br/>
     * Use this to compose checkers that already have cocos added. All
     * registered context conditions of all checkers are executed. By default
     * at least an empty checker is registered for super languages.
     * {@code htmlred._cocos.HTMLRedCoCoChecker} is used.
     * 
     * @param checker the checker to add.
     * @see #checkAll(ASTHTMLRedNode)
     */
    public void addChecker(htmlred._cocos.HTMLRedCoCoChecker checker) {
      // note that getRealThis is not needed here.
      this.htmlred__cocos_HTMLRedCoCoChecker.add(checker);
    }


          private Collection<htmlred._cocos.HTMLRedASTPCoCo> htmlred__ast_ASTPCoCos = new LinkedHashSet<>();
 
        /**
         * Adds a context condition. It is executed when running the checker.
         * 
         * @param coco the coco to add.
         * @see #checkAll(ASTHTMLRedNode)
         */
        public HTMLRedCoCoChecker addCoCo(htmlred._cocos.HTMLRedASTPCoCo coco) {
            htmlred__ast_ASTPCoCos.add(coco);
          return this;
        }

        @Override
        public void visit(htmlred._ast.ASTP node) {
            // execute all registered cocos of this checker
            for (htmlred._cocos.HTMLRedASTPCoCo coco : htmlred__ast_ASTPCoCos) {
              coco.check(node);
            }
            // and delegate to all registered checkers of the same language as well
            htmlred__cocos_HTMLRedCoCoChecker.stream().forEach(c -> c.visit(node));
        }

          private Collection<htmlred._cocos.HTMLRedASTAlternativesCoCo> htmlred__ast_ASTAlternativesCoCos = new LinkedHashSet<>();
 
        /**
         * Adds a context condition. It is executed when running the checker.
         * 
         * @param coco the coco to add.
         * @see #checkAll(ASTHTMLRedNode)
         */
        public HTMLRedCoCoChecker addCoCo(htmlred._cocos.HTMLRedASTAlternativesCoCo coco) {
            htmlred__ast_ASTAlternativesCoCos.add(coco);
          return this;
        }

        @Override
        public void visit(htmlred._ast.ASTAlternatives node) {
            // execute all registered cocos of this checker
            for (htmlred._cocos.HTMLRedASTAlternativesCoCo coco : htmlred__ast_ASTAlternativesCoCos) {
              coco.check(node);
            }
            // and delegate to all registered checkers of the same language as well
            htmlred__cocos_HTMLRedCoCoChecker.stream().forEach(c -> c.visit(node));
        }

          private Collection<htmlred._cocos.HTMLRedASTBCoCo> htmlred__ast_ASTBCoCos = new LinkedHashSet<>();
 
        /**
         * Adds a context condition. It is executed when running the checker.
         * 
         * @param coco the coco to add.
         * @see #checkAll(ASTHTMLRedNode)
         */
        public HTMLRedCoCoChecker addCoCo(htmlred._cocos.HTMLRedASTBCoCo coco) {
            htmlred__ast_ASTBCoCos.add(coco);
          return this;
        }

        @Override
        public void visit(htmlred._ast.ASTB node) {
            // execute all registered cocos of this checker
            for (htmlred._cocos.HTMLRedASTBCoCo coco : htmlred__ast_ASTBCoCos) {
              coco.check(node);
            }
            // and delegate to all registered checkers of the same language as well
            htmlred__cocos_HTMLRedCoCoChecker.stream().forEach(c -> c.visit(node));
        }

          private Collection<htmlred._cocos.HTMLRedASTICoCo> htmlred__ast_ASTICoCos = new LinkedHashSet<>();
 
        /**
         * Adds a context condition. It is executed when running the checker.
         * 
         * @param coco the coco to add.
         * @see #checkAll(ASTHTMLRedNode)
         */
        public HTMLRedCoCoChecker addCoCo(htmlred._cocos.HTMLRedASTICoCo coco) {
            htmlred__ast_ASTICoCos.add(coco);
          return this;
        }

        @Override
        public void visit(htmlred._ast.ASTI node) {
            // execute all registered cocos of this checker
            for (htmlred._cocos.HTMLRedASTICoCo coco : htmlred__ast_ASTICoCos) {
              coco.check(node);
            }
            // and delegate to all registered checkers of the same language as well
            htmlred__cocos_HTMLRedCoCoChecker.stream().forEach(c -> c.visit(node));
        }

          private Collection<htmlred._cocos.HTMLRedASTHTMLRedNodeCoCo> htmlred__ast_ASTHTMLRedNodeCoCos = new LinkedHashSet<>();
 
        /**
         * Adds a context condition. It is executed when running the checker.
         * 
         * @param coco the coco to add.
         * @see #checkAll(ASTHTMLRedNode)
         */
        public HTMLRedCoCoChecker addCoCo(htmlred._cocos.HTMLRedASTHTMLRedNodeCoCo coco) {
            htmlred__ast_ASTHTMLRedNodeCoCos.add(coco);
          return this;
        }

        @Override
        public void visit(htmlred._ast.ASTHTMLRedNode node) {
            // execute all registered cocos of this checker
            for (htmlred._cocos.HTMLRedASTHTMLRedNodeCoCo coco : htmlred__ast_ASTHTMLRedNodeCoCos) {
              coco.check(node);
            }
            // and delegate to all registered checkers of the same language as well
            htmlred__cocos_HTMLRedCoCoChecker.stream().forEach(c -> c.visit(node));
        }
}
