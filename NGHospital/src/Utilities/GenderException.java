/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

public class GenderException extends RuntimeException
{
   public String getLocalizedMessage()
      {
        return "Please Enter your Gender";
      }
}

