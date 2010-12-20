/**
 * Copyright (C) 2009 eXo Platform SAS.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/* 
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package org.exoplatform.services.chars.chardet;

public class EUCTWVerifier extends Verifier
{

	
   public EUCTWVerifier()
   {

      cclass = new int[256 / 8];

      cclass[0] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[1] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[2] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[3] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((0) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[4] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[5] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[6] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[7] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[8] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[9] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[10] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[11] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[12] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[13] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[14] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[15] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16) | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[16] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16) | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[17] =
         ((((((((((((0) << 4) | (6)))) << 8) | (((((0) << 4) | (0))))))) << 16) | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[18] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16) | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[19] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16) | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[20] =
         ((((((((((((4) << 4) | (4)))) << 8) | (((((4) << 4) | (4))))))) << 16) | (((((((((4) << 4) | (4)))) << 8) | (((((3) << 4) | (0)))))))));
      cclass[21] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16) | (((((((((1) << 4) | (1)))) << 8) | (((((5) << 4) | (5)))))))));
      cclass[22] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16) | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[23] =
         ((((((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1))))))) << 16) | (((((((((1) << 4) | (1)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[24] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((1) << 4) | (3)))) << 8) | (((((1) << 4) | (1)))))))));
      cclass[25] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[26] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[27] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[28] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[29] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[30] =
         ((((((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));
      cclass[31] =
         ((((((((((((0) << 4) | (3)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (3)))) << 8) | (((((3) << 4) | (3)))))))));

      states = new int[6];

      states[0] =
         ((((((((((((eError) << 4) | (4)))) << 8) | (((((3) << 4) | (3))))))) << 16) | (((((((((3) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[1] =
         ((((((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eError) << 4) | (eError))))))) << 16) | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[2] =
         ((((((((((((eError) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (eItsMe))))))) << 16) | (((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eItsMe) << 4) | (eItsMe)))))))));
      states[3] =
         ((((((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError))))))) << 16) | (((((((((eError) << 4) | (eStart)))) << 8) | (((((eStart) << 4) | (eStart)))))))));
      states[4] =
         ((((((((((((eStart) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (eStart))))))) << 16) | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (5)))))))));
      states[5] =
         ((((((((((((eStart) << 4) | (eStart)))) << 8) | (((((eStart) << 4) | (eStart))))))) << 16) | (((((((((eStart) << 4) | (eStart)))) << 8) | (((((eError) << 4) | (eStart)))))))));

      charset = "x-euc-tw";
      stFactor = 7;

   }

}
