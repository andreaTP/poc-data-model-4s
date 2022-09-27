package io.apicurio.datamodels.core

import scala.scalajs.js.annotation._

@JSExportTopLevel("visitors")
object visitors {

  trait IVisitor {
    // def visitContact(node: Content);
    // def visitDocument(node: Document);
    @JSExport
    def visitExtension(node: Extension): Unit
    // void visitExternalDocumentation(ExternalDocumentation node);
    // void visitInfo(Info node);
    // void visitLicense(License node);
    // void visitOperation(Operation node);
    // void visitParameterDefinition(IDefinition node);
    // void visitParameter(Parameter node);
    // void visitSchemaDefinition(IDefinition node);
    // void visitSchema(Schema node);
    // void visitSecurityRequirement(SecurityRequirement node);
    // void visitSecurityScheme(SecurityScheme node);
    // void visitTag(Tag node);
    // void visitValidationProblem(ValidationProblem problem);
  }

  trait IVisitable {
    def accept(visitor: IVisitor): Unit
  }

  abstract class Node extends IVisitable {
    
    private val __modelIdCounter: Int = 0
    val _parent: Node = null
    protected val _modelId: Int = __modelIdCounter + 1
    protected val _attributes: Map[String, Any] = Map()
  }

  case class Extension(name: String, value: Object) extends Node {
    def accept(visitor: IVisitor): Unit = {
      visitor.visitExtension(this)
    }
  }

}
