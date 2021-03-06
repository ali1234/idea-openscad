// This is a generated file. Not intended for manual editing.
package com.javampire.openscad.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;

public interface OpenSCADQualificationExpr extends OpenSCADExpr, OpenSCADNamedElement {

  @NotNull
  OpenSCADExpr getExpr();

  ItemPresentation getPresentation();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  PsiReference getReference();

}
