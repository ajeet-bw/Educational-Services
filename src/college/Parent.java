/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.awt.event.KeyEvent;

/**
 *
 * @author User
 */
public class Parent {
     public void NumbersOnly(java.awt.event.KeyEvent evt)
  {
   char iNumber  = evt.getKeyChar();
   if(!(Character.isDigit(iNumber))||(iNumber == KeyEvent.VK_BACK_SPACE)||(iNumber == KeyEvent.VK_DELETE))
   {
     evt.consume();
   }
  }
  public void StringOnly(java.awt.event.KeyEvent evt)
  {
   int iString  = evt.getKeyChar();
   if(Character.isDigit(iString)||(iString == KeyEvent.VK_BACK_SPACE)||(iString == KeyEvent.VK_DELETE))
   {
     evt.consume();
   }
  }
}
