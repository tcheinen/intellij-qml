// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlPropertyDefinition extends QmlPsiElement {

  @Nullable
  QmlList getList();

  @Nullable
  QmlMethodBody getMethodBody();

  @Nullable
  QmlMethodCall getMethodCall();

  @Nullable
  QmlObject getObject();

  @NotNull
  QmlProperty getProperty();

  @Nullable
  QmlType getType();

}
