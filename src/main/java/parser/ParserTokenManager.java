/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package parser;

import dataStructures.*;

public class ParserTokenManager implements ParserConstants {
   public static java.io.PrintStream debugStream = System.out;

   public static void setDebugStream(java.io.PrintStream ds) {
      debugStream = ds;
   }

   private static final int jjStopStringLiteralDfa_0(int pos, long active0) {
      switch (pos) {
         default:
            return -1;
      }
   }

   private static final int jjStartNfa_0(int pos, long active0) {
      return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
   }

   static private final int jjStopAtPos(int pos, int kind) {
      jjmatchedKind = kind;
      jjmatchedPos = pos;
      return pos + 1;
   }

   static private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
      jjmatchedKind = kind;
      jjmatchedPos = pos;
      try {
         curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
         return pos + 1;
      }
      return jjMoveNfa_0(state, pos + 1);
   }

   static private final int jjMoveStringLiteralDfa0_0() {
      switch (curChar) {
         case 40:
            return jjStopAtPos(0, 33);
         case 41:
            return jjStopAtPos(0, 34);
         case 42:
            return jjStopAtPos(0, 5);
         case 44:
            return jjStopAtPos(0, 32);
         case 46:
            return jjStopAtPos(0, 31);
         case 59:
            return jjStopAtPos(0, 30);
         default:
            return jjMoveNfa_0(0, 0);
      }
   }

   static private final void jjCheckNAdd(int state) {
      if (jjrounds[state] != jjround) {
         jjstateSet[jjnewStateCnt++] = state;
         jjrounds[state] = jjround;
      }
   }

   static private final void jjAddStates(int start, int end) {
      do {
         jjstateSet[jjnewStateCnt++] = jjnextStates[start];
      } while (start++ != end);
   }

   static private final void jjCheckNAddTwoStates(int state1, int state2) {
      jjCheckNAdd(state1);
      jjCheckNAdd(state2);
   }

   static private final void jjCheckNAddStates(int start, int end) {
      do {
         jjCheckNAdd(jjnextStates[start]);
      } while (start++ != end);
   }

   static private final void jjCheckNAddStates(int start) {
      jjCheckNAdd(jjnextStates[start]);
      jjCheckNAdd(jjnextStates[start + 1]);
   }

   static private final int jjMoveNfa_0(int startState, int curPos) {
      int[] nextStates;
      int startsAt = 0;
      jjnewStateCnt = 178;
      int i = 1;
      jjstateSet[0] = startState;
      int j, kind = 0x7fffffff;
      for (;;) {
         if (++jjround == 0x7fffffff)
            ReInitRounds();
         if (curChar < 64) {
            long l = 1L << curChar;
            MatchLoop: do {
               switch (jjstateSet[--i]) {
                  case 0:
                     if ((0x3ff000000000000L & l) != 0L)
                        jjCheckNAddTwoStates(38, 39);
                     else if ((0x7000000000000000L & l) != 0L) {
                        if (kind > 6)
                           kind = 6;
                     } else if (curChar == 34)
                        jjCheckNAdd(42);
                     if ((0x3fe000000000000L & l) != 0L) {
                        if (kind > 26)
                           kind = 26;
                        jjCheckNAdd(37);
                     } else if (curChar == 60)
                        jjCheckNAddTwoStates(1, 95);
                     else if (curChar == 62)
                        jjCheckNAdd(1);
                     break;
                  case 1:
                     if (curChar == 61 && kind > 6)
                        kind = 6;
                     break;
                  case 2:
                     if (curChar == 62)
                        jjCheckNAdd(1);
                     break;
                  case 36:
                     if ((0x3fe000000000000L & l) == 0L)
                        break;
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(37);
                     break;
                  case 37:
                     if ((0x3ff000000000000L & l) == 0L)
                        break;
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(37);
                     break;
                  case 38:
                     if ((0x3ff000000000000L & l) != 0L)
                        jjCheckNAddTwoStates(38, 39);
                     break;
                  case 39:
                     if (curChar == 46)
                        jjCheckNAdd(40);
                     break;
                  case 40:
                     if ((0x3ff000000000000L & l) == 0L)
                        break;
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(40);
                     break;
                  case 41:
                     if (curChar == 34)
                        jjCheckNAdd(42);
                     break;
                  case 42:
                     if ((0x3ff000000000000L & l) != 0L)
                        jjCheckNAddTwoStates(42, 43);
                     break;
                  case 43:
                     if (curChar == 34 && kind > 28)
                        kind = 28;
                     break;
                  case 45:
                     if ((0x3ff000000000000L & l) == 0L)
                        break;
                     if (kind > 29)
                        kind = 29;
                     jjstateSet[jjnewStateCnt++] = 45;
                     break;
                  case 94:
                     if (curChar == 60)
                        jjCheckNAddTwoStates(1, 95);
                     break;
                  case 95:
                     if (curChar == 62 && kind > 6)
                        kind = 6;
                     break;
                  default:
                     break;
               }
            } while (i != startsAt);
         } else if (curChar < 128) {
            long l = 1L << (curChar & 077);
            MatchLoop: do {
               switch (jjstateSet[--i]) {
                  case 0:
                     if ((0x7fffffe07fffffeL & l) != 0L) {
                        if (kind > 29)
                           kind = 29;
                        jjCheckNAdd(45);
                     }
                     if (curChar == 68)
                        jjAddStates(0, 3);
                     else if (curChar == 83)
                        jjAddStates(4, 6);
                     else if (curChar == 73)
                        jjAddStates(7, 11);
                     else if (curChar == 100)
                        jjAddStates(12, 13);
                     else if (curChar == 116)
                        jjAddStates(14, 15);
                     else if (curChar == 105)
                        jjAddStates(16, 17);
                     else if (curChar == 102)
                        jjAddStates(18, 19);
                     else if (curChar == 70)
                        jjAddStates(20, 21);
                     else if (curChar == 87)
                        jjAddStates(22, 23);
                     else if (curChar == 65)
                        jjAddStates(24, 25);
                     else if (curChar == 86)
                        jjAddStates(26, 27);
                     else if (curChar == 67)
                        jjAddStates(28, 29);
                     else if (curChar == 84)
                        jjAddStates(30, 31);
                     else if (curChar == 66)
                        jjstateSet[jjnewStateCnt++] = 34;
                     else if (curChar == 99)
                        jjstateSet[jjnewStateCnt++] = 27;
                     else if (curChar == 118)
                        jjstateSet[jjnewStateCnt++] = 21;
                     else if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 15;
                     else if (curChar == 119)
                        jjstateSet[jjnewStateCnt++] = 12;
                     else if (curChar == 115)
                        jjstateSet[jjnewStateCnt++] = 7;
                     break;
                  case 3:
                     if (curChar == 116 && kind > 13)
                        kind = 13;
                     break;
                  case 4:
                  case 149:
                     if (curChar == 99)
                        jjCheckNAdd(3);
                     break;
                  case 5:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 4;
                     break;
                  case 6:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 5;
                     break;
                  case 7:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 6;
                     break;
                  case 8:
                     if (curChar == 115)
                        jjstateSet[jjnewStateCnt++] = 7;
                     break;
                  case 9:
                     if (curChar == 101 && kind > 15)
                        kind = 15;
                     break;
                  case 10:
                  case 80:
                     if (curChar == 114)
                        jjCheckNAdd(9);
                     break;
                  case 11:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 10;
                     break;
                  case 12:
                     if (curChar == 104)
                        jjstateSet[jjnewStateCnt++] = 11;
                     break;
                  case 13:
                     if (curChar == 119)
                        jjstateSet[jjnewStateCnt++] = 12;
                     break;
                  case 14:
                     if (curChar == 100 && kind > 16)
                        kind = 16;
                     break;
                  case 15:
                  case 76:
                     if (curChar == 110)
                        jjCheckNAdd(14);
                     break;
                  case 16:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 15;
                     break;
                  case 17:
                     if (curChar == 115 && kind > 19)
                        kind = 19;
                     break;
                  case 18:
                  case 66:
                     if (curChar == 101)
                        jjCheckNAdd(17);
                     break;
                  case 19:
                     if (curChar == 117)
                        jjstateSet[jjnewStateCnt++] = 18;
                     break;
                  case 20:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 19;
                     break;
                  case 21:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 20;
                     break;
                  case 22:
                     if (curChar == 118)
                        jjstateSet[jjnewStateCnt++] = 21;
                     break;
                  case 23:
                     if (curChar == 101 && kind > 20)
                        kind = 20;
                     break;
                  case 24:
                  case 56:
                     if (curChar == 116)
                        jjCheckNAdd(23);
                     break;
                  case 25:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 24;
                     break;
                  case 26:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 25;
                     break;
                  case 27:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 26;
                     break;
                  case 28:
                     if (curChar == 99)
                        jjstateSet[jjnewStateCnt++] = 27;
                     break;
                  case 29:
                     if (curChar == 78 && kind > 24)
                        kind = 24;
                     break;
                  case 30:
                     if (curChar == 65)
                        jjstateSet[jjnewStateCnt++] = 29;
                     break;
                  case 31:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 30;
                     break;
                  case 32:
                     if (curChar == 76)
                        jjstateSet[jjnewStateCnt++] = 31;
                     break;
                  case 33:
                     if (curChar == 79)
                        jjstateSet[jjnewStateCnt++] = 32;
                     break;
                  case 34:
                     if (curChar == 79)
                        jjstateSet[jjnewStateCnt++] = 33;
                     break;
                  case 35:
                     if (curChar == 66)
                        jjstateSet[jjnewStateCnt++] = 34;
                     break;
                  case 42:
                     if ((0x7fffffe87fffffeL & l) != 0L)
                        jjAddStates(32, 33);
                     break;
                  case 44:
                     if ((0x7fffffe07fffffeL & l) == 0L)
                        break;
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(45);
                     break;
                  case 45:
                     if ((0x7fffffe87fffffeL & l) == 0L)
                        break;
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(45);
                     break;
                  case 46:
                     if (curChar == 84)
                        jjAddStates(30, 31);
                     break;
                  case 47:
                     if (curChar == 101 && kind > 21)
                        kind = 21;
                     break;
                  case 48:
                  case 113:
                     if (curChar == 108)
                        jjCheckNAdd(47);
                     break;
                  case 49:
                     if (curChar == 98)
                        jjstateSet[jjnewStateCnt++] = 48;
                     break;
                  case 50:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 49;
                     break;
                  case 51:
                     if (curChar == 69 && kind > 21)
                        kind = 21;
                     break;
                  case 52:
                     if (curChar == 76)
                        jjstateSet[jjnewStateCnt++] = 51;
                     break;
                  case 53:
                     if (curChar == 66)
                        jjstateSet[jjnewStateCnt++] = 52;
                     break;
                  case 54:
                     if (curChar == 65)
                        jjstateSet[jjnewStateCnt++] = 53;
                     break;
                  case 55:
                     if (curChar == 67)
                        jjAddStates(28, 29);
                     break;
                  case 57:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 56;
                     break;
                  case 58:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 57;
                     break;
                  case 59:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 58;
                     break;
                  case 60:
                     if (curChar == 69 && kind > 20)
                        kind = 20;
                     break;
                  case 61:
                     if (curChar == 84)
                        jjstateSet[jjnewStateCnt++] = 60;
                     break;
                  case 62:
                     if (curChar == 65)
                        jjstateSet[jjnewStateCnt++] = 61;
                     break;
                  case 63:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 62;
                     break;
                  case 64:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 63;
                     break;
                  case 65:
                     if (curChar == 86)
                        jjAddStates(26, 27);
                     break;
                  case 67:
                     if (curChar == 117)
                        jjstateSet[jjnewStateCnt++] = 66;
                     break;
                  case 68:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 67;
                     break;
                  case 69:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 68;
                     break;
                  case 70:
                     if (curChar == 83 && kind > 19)
                        kind = 19;
                     break;
                  case 71:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 70;
                     break;
                  case 72:
                     if (curChar == 85)
                        jjstateSet[jjnewStateCnt++] = 71;
                     break;
                  case 73:
                     if (curChar == 76)
                        jjstateSet[jjnewStateCnt++] = 72;
                     break;
                  case 74:
                     if (curChar == 65)
                        jjstateSet[jjnewStateCnt++] = 73;
                     break;
                  case 75:
                     if (curChar == 65)
                        jjAddStates(24, 25);
                     break;
                  case 77:
                     if (curChar == 68 && kind > 16)
                        kind = 16;
                     break;
                  case 78:
                     if (curChar == 78)
                        jjstateSet[jjnewStateCnt++] = 77;
                     break;
                  case 79:
                     if (curChar == 87)
                        jjAddStates(22, 23);
                     break;
                  case 81:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 80;
                     break;
                  case 82:
                     if (curChar == 104)
                        jjstateSet[jjnewStateCnt++] = 81;
                     break;
                  case 83:
                     if (curChar == 69 && kind > 15)
                        kind = 15;
                     break;
                  case 84:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 83;
                     break;
                  case 85:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 84;
                     break;
                  case 86:
                     if (curChar == 72)
                        jjstateSet[jjnewStateCnt++] = 85;
                     break;
                  case 87:
                     if (curChar == 70)
                        jjAddStates(20, 21);
                     break;
                  case 88:
                     if (curChar == 109 && kind > 14)
                        kind = 14;
                     break;
                  case 89:
                  case 97:
                     if (curChar == 111)
                        jjCheckNAdd(88);
                     break;
                  case 90:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 89;
                     break;
                  case 91:
                     if (curChar == 77 && kind > 14)
                        kind = 14;
                     break;
                  case 92:
                     if (curChar == 79)
                        jjstateSet[jjnewStateCnt++] = 91;
                     break;
                  case 93:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 92;
                     break;
                  case 96:
                     if (curChar == 102)
                        jjAddStates(18, 19);
                     break;
                  case 98:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 97;
                     break;
                  case 99:
                     if (curChar == 101 && kind > 25)
                        kind = 25;
                     break;
                  case 100:
                     if (curChar == 115)
                        jjCheckNAdd(99);
                     break;
                  case 101:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 100;
                     break;
                  case 102:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 101;
                     break;
                  case 103:
                     if (curChar == 105)
                        jjAddStates(16, 17);
                     break;
                  case 104:
                     if (curChar == 116 && kind > 17)
                        kind = 17;
                     break;
                  case 105:
                  case 128:
                     if (curChar == 114)
                        jjCheckNAdd(104);
                     break;
                  case 106:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 105;
                     break;
                  case 107:
                     if (curChar == 115)
                        jjstateSet[jjnewStateCnt++] = 106;
                     break;
                  case 108:
                     if (curChar == 110)
                        jjstateSet[jjnewStateCnt++] = 107;
                     break;
                  case 109:
                     if (curChar == 111 && kind > 18)
                        kind = 18;
                     break;
                  case 110:
                  case 137:
                     if (curChar == 116)
                        jjCheckNAdd(109);
                     break;
                  case 111:
                     if (curChar == 110)
                        jjstateSet[jjnewStateCnt++] = 110;
                     break;
                  case 112:
                     if (curChar == 116)
                        jjAddStates(14, 15);
                     break;
                  case 114:
                     if (curChar == 98)
                        jjstateSet[jjnewStateCnt++] = 113;
                     break;
                  case 115:
                     if (curChar == 97)
                        jjstateSet[jjnewStateCnt++] = 114;
                     break;
                  case 116:
                     if (curChar == 117)
                        jjCheckNAdd(99);
                     break;
                  case 117:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 116;
                     break;
                  case 118:
                     if (curChar == 100)
                        jjAddStates(12, 13);
                     break;
                  case 119:
                     if (curChar == 112 && kind > 22)
                        kind = 22;
                     break;
                  case 120:
                  case 164:
                     if (curChar == 111)
                        jjCheckNAdd(119);
                     break;
                  case 121:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 120;
                     break;
                  case 122:
                     if (curChar == 101 && kind > 23)
                        kind = 23;
                     break;
                  case 123:
                  case 169:
                     if (curChar == 116)
                        jjCheckNAdd(122);
                     break;
                  case 124:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 123;
                     break;
                  case 125:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 124;
                     break;
                  case 126:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 125;
                     break;
                  case 127:
                     if (curChar == 73)
                        jjAddStates(7, 11);
                     break;
                  case 129:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 128;
                     break;
                  case 130:
                     if (curChar == 115)
                        jjstateSet[jjnewStateCnt++] = 129;
                     break;
                  case 131:
                     if (curChar == 110)
                        jjstateSet[jjnewStateCnt++] = 130;
                     break;
                  case 132:
                     if (curChar == 84 && kind > 17)
                        kind = 17;
                     break;
                  case 133:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 132;
                     break;
                  case 134:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 133;
                     break;
                  case 135:
                     if (curChar == 83)
                        jjstateSet[jjnewStateCnt++] = 134;
                     break;
                  case 136:
                     if (curChar == 78)
                        jjstateSet[jjnewStateCnt++] = 135;
                     break;
                  case 138:
                     if (curChar == 110)
                        jjstateSet[jjnewStateCnt++] = 137;
                     break;
                  case 139:
                     if (curChar == 79 && kind > 18)
                        kind = 18;
                     break;
                  case 140:
                     if (curChar == 84)
                        jjstateSet[jjnewStateCnt++] = 139;
                     break;
                  case 141:
                     if (curChar == 78)
                        jjstateSet[jjnewStateCnt++] = 140;
                     break;
                  case 142:
                     if (curChar == 82 && kind > 24)
                        kind = 24;
                     break;
                  case 143:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 142;
                     break;
                  case 144:
                     if (curChar == 71)
                        jjstateSet[jjnewStateCnt++] = 143;
                     break;
                  case 145:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 144;
                     break;
                  case 146:
                     if (curChar == 84)
                        jjstateSet[jjnewStateCnt++] = 145;
                     break;
                  case 147:
                     if (curChar == 78)
                        jjstateSet[jjnewStateCnt++] = 146;
                     break;
                  case 148:
                     if (curChar == 83)
                        jjAddStates(4, 6);
                     break;
                  case 150:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 149;
                     break;
                  case 151:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 150;
                     break;
                  case 152:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 151;
                     break;
                  case 153:
                     if (curChar == 84 && kind > 13)
                        kind = 13;
                     break;
                  case 154:
                     if (curChar == 67)
                        jjstateSet[jjnewStateCnt++] = 153;
                     break;
                  case 155:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 154;
                     break;
                  case 156:
                     if (curChar == 76)
                        jjstateSet[jjnewStateCnt++] = 155;
                     break;
                  case 157:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 156;
                     break;
                  case 158:
                     if (curChar == 71 && kind > 24)
                        kind = 24;
                     break;
                  case 159:
                     if (curChar == 78)
                        jjstateSet[jjnewStateCnt++] = 158;
                     break;
                  case 160:
                     if (curChar == 73)
                        jjstateSet[jjnewStateCnt++] = 159;
                     break;
                  case 161:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 160;
                     break;
                  case 162:
                     if (curChar == 84)
                        jjstateSet[jjnewStateCnt++] = 161;
                     break;
                  case 163:
                     if (curChar == 68)
                        jjAddStates(0, 3);
                     break;
                  case 165:
                     if (curChar == 114)
                        jjstateSet[jjnewStateCnt++] = 164;
                     break;
                  case 166:
                     if (curChar == 80 && kind > 22)
                        kind = 22;
                     break;
                  case 167:
                     if (curChar == 79)
                        jjstateSet[jjnewStateCnt++] = 166;
                     break;
                  case 168:
                     if (curChar == 82)
                        jjstateSet[jjnewStateCnt++] = 167;
                     break;
                  case 170:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 169;
                     break;
                  case 171:
                     if (curChar == 108)
                        jjstateSet[jjnewStateCnt++] = 170;
                     break;
                  case 172:
                     if (curChar == 101)
                        jjstateSet[jjnewStateCnt++] = 171;
                     break;
                  case 173:
                     if (curChar == 69 && kind > 23)
                        kind = 23;
                     break;
                  case 174:
                     if (curChar == 84)
                        jjstateSet[jjnewStateCnt++] = 173;
                     break;
                  case 175:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 174;
                     break;
                  case 176:
                     if (curChar == 76)
                        jjstateSet[jjnewStateCnt++] = 175;
                     break;
                  case 177:
                     if (curChar == 69)
                        jjstateSet[jjnewStateCnt++] = 176;
                     break;
                  default:
                     break;
               }
            } while (i != startsAt);
         } else {
            int i2 = (curChar & 0xff) >> 6;
            long l2 = 1L << (curChar & 077);
            MatchLoop: do {
               switch (jjstateSet[--i]) {
                  default:
                     break;
               }
            } while (i != startsAt);
         }
         if (kind != 0x7fffffff) {
            jjmatchedKind = kind;
            jjmatchedPos = curPos;
            kind = 0x7fffffff;
         }
         ++curPos;
         if ((i = jjnewStateCnt) == (startsAt = 178 - (jjnewStateCnt = startsAt)))
            return curPos;
         try {
            curChar = input_stream.readChar();
         } catch (java.io.IOException e) {
            return curPos;
         }
      }
   }

   static final int[] jjnextStates = {
         165, 168, 172, 177, 152, 157, 162, 131, 136, 138, 141, 147, 121, 126, 115, 117,
         108, 111, 98, 102, 90, 93, 82, 86, 76, 78, 69, 74, 59, 64, 50, 54,
         42, 43,
   };
   public static final String[] jjstrLiteralImages = {
         "", null, null, null, null, "\52", null, null, null, null, null, null, null,
         null, null, null, null, null, null, null, null, null, null, null, null, null, null,
         null, null, null, "\73", "\56", "\54", "\50", "\51", };
   public static final String[] lexStateNames = {
         "DEFAULT",
   };
   static final long[] jjtoToken = {
         0x7ffffe061L,
   };
   static final long[] jjtoSkip = {
         0x1eL,
   };
   static protected SimpleCharStream input_stream;
   static private final int[] jjrounds = new int[178];
   static private final int[] jjstateSet = new int[356];
   static protected char curChar;

   public ParserTokenManager(SimpleCharStream stream) {
      if (input_stream != null)
         throw new TokenMgrError(
               "ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.",
               TokenMgrError.STATIC_LEXER_ERROR);
      input_stream = stream;
   }

   public ParserTokenManager(SimpleCharStream stream, int lexState) {
      this(stream);
      SwitchTo(lexState);
   }

   static public void ReInit(SimpleCharStream stream) {
      jjmatchedPos = jjnewStateCnt = 0;
      curLexState = defaultLexState;
      input_stream = stream;
      ReInitRounds();
   }

   static private final void ReInitRounds() {
      int i;
      jjround = 0x80000001;
      for (i = 178; i-- > 0;)
         jjrounds[i] = 0x80000000;
   }

   static public void ReInit(SimpleCharStream stream, int lexState) {
      ReInit(stream);
      SwitchTo(lexState);
   }

   static public void SwitchTo(int lexState) {
      if (lexState >= 1 || lexState < 0)
         throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
               TokenMgrError.INVALID_LEXICAL_STATE);
      else
         curLexState = lexState;
   }

   static protected Token jjFillToken() {
      Token t = Token.newToken(jjmatchedKind);
      t.kind = jjmatchedKind;
      String im = jjstrLiteralImages[jjmatchedKind];
      t.image = (im == null) ? input_stream.GetImage() : im;
      t.beginLine = input_stream.getBeginLine();
      t.beginColumn = input_stream.getBeginColumn();
      t.endLine = input_stream.getEndLine();
      t.endColumn = input_stream.getEndColumn();
      return t;
   }

   static int curLexState = 0;
   static int defaultLexState = 0;
   static int jjnewStateCnt;
   static int jjround;
   static int jjmatchedPos;
   static int jjmatchedKind;

   public static Token getNextToken() {
      int kind;
      Token specialToken = null;
      Token matchedToken;
      int curPos = 0;

      EOFLoop: for (;;) {
         try {
            curChar = input_stream.BeginToken();
         } catch (java.io.IOException e) {
            jjmatchedKind = 0;
            matchedToken = jjFillToken();
            return matchedToken;
         }

         try {
            input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         } catch (java.io.IOException e1) {
            continue EOFLoop;
         }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedKind != 0x7fffffff) {
            if (jjmatchedPos + 1 < curPos)
               input_stream.backup(curPos - jjmatchedPos - 1);
            if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
               matchedToken = jjFillToken();
               return matchedToken;
            } else {
               continue EOFLoop;
            }
         }
         int error_line = input_stream.getEndLine();
         int error_column = input_stream.getEndColumn();
         String error_after = null;
         boolean EOFSeen = false;
         try {
            input_stream.readChar();
            input_stream.backup(1);
         } catch (java.io.IOException e1) {
            EOFSeen = true;
            error_after = curPos <= 1 ? "" : input_stream.GetImage();
            if (curChar == '\n' || curChar == '\r') {
               error_line++;
               error_column = 0;
            } else
               error_column++;
         }
         if (!EOFSeen) {
            input_stream.backup(1);
            error_after = curPos <= 1 ? "" : input_stream.GetImage();
         }
         throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
               TokenMgrError.LEXICAL_ERROR);
      }
   }

}
