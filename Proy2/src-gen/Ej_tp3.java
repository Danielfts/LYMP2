// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Ej_tp3.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Ej_tp3 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      Object Q=$fix($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY(GCollections.asSet($opIntvlY("a","z")),GCollections.asSet($opIntvlY("A","Z"))),GCollections.asSet($opIntvlY("0","9"))),GCollections.asSet("(")),GCollections.asSet(")")),GCollections.asSet(",")),GCollections.asSet(";")),GCollections.asSet(":")),GCollections.asSet("=")),GCollections.asSet(">")),GCollections.asSet("<")),GCollections.asSet("-")),GCollections.asSet("+")),GCollections.asSet("/")),GCollections.asSet("*")),GCollections.asSet(" ")));
      $line=7;
      Object \u03A3=$fix($opUnionY(Q,GCollections.asSet("init")));
      $line=8;
      Object q=$fix(GCollections.asSet("init"));
      $line=9;
      Object F=$fix(Q);
      $line=11;
      $invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3,q,F,new GMethod(Ej_tp3.class,"\u03B4"),new GMethod(Ej_tp3.class,"g"),new GMethod(Ej_tp3.class,"h")});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Ej_tp3.class,"main",$line);
    }
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=15;
      $result=s;
      if (true) break $try;
      $line=16;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Ej_tp3.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v1, Object a) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object x=$v2.next();
      Object y=$v2.next();
      $line=19;
      if (($opEqualY(a," ")&&$opEqualY(y," "))) {
        $line=19;
        $result="";
        if (true) break $try;
      }
      else {
        $line=20;
        if (($opEqualY(a," ")&&$opEqualY(y,"begin"))) {
          $line=20;
          $result="b";
          if (true) break $try;
        }
        else {
          $line=21;
          if (($opEqualY(a," ")&&$opEqualY(y,"function"))) {
            $line=21;
            $result="f";
            if (true) break $try;
          }
          else {
            $line=22;
            if (($opEqualY(a," ")&&$opEqualY(y,"if"))) {
              $line=22;
              $result="i";
              if (true) break $try;
            }
            else {
              $line=23;
              if (($opEqualY(a," ")&&$opEqualY(y,"then"))) {
                $line=23;
                $result="t";
                if (true) break $try;
              }
              else {
                $line=24;
                if (($opEqualY(a," ")&&$opEqualY(y,"else"))) {
                  $line=24;
                  $result="e";
                  if (true) break $try;
                }
                else {
                  $line=25;
                  if (($opEqualY(a," ")&&$opEqualY(y,"end"))) {
                    $line=25;
                    $result="n";
                    if (true) break $try;
                  }
                  else {
                    $line=26;
                    if (($opEqualY(a," ")&&$opEqualY(y,"while"))) {
                      $line=26;
                      $result="w";
                      if (true) break $try;
                    }
                    else {
                      $line=27;
                      if (($opEqualY(a," ")&&$opEqualY(y,"do"))) {
                        $line=27;
                        $result="d";
                        if (true) break $try;
                      }
                      else {
                        $line=28;
                        if (($opEqualY(a," ")&&$opEqualY(y,"mod"))) {
                          $line=28;
                          $result="m";
                          if (true) break $try;
                        }
                        else {
                          $line=29;
                          if (($opEqualY(a," ")&&$opEqualY(y,"("))) {
                            $line=29;
                            $result="(";
                            if (true) break $try;
                          }
                          else {
                            $line=30;
                            if (($opEqualY(a," ")&&$opEqualY(y,")"))) {
                              $line=30;
                              $result=")";
                              if (true) break $try;
                            }
                            else {
                              $line=31;
                              if (($opEqualY(a," ")&&$opEqualY(y,","))) {
                                $line=31;
                                $result=",";
                                if (true) break $try;
                              }
                              else {
                                $line=32;
                                if (($opEqualY(a," ")&&$opEqualY(y,":"))) {
                                  $line=32;
                                  $result=":";
                                  if (true) break $try;
                                }
                                else {
                                  $line=33;
                                  if (($opEqualY(a," ")&&$opEqualY(y,";"))) {
                                    $line=33;
                                    $result=";";
                                    if (true) break $try;
                                  }
                                  else {
                                    $line=34;
                                    if (($opEqualY(a," ")&&$opEqualY(y,"="))) {
                                      $line=34;
                                      $result="=";
                                      if (true) break $try;
                                    }
                                    else {
                                      $line=35;
                                      if (($opEqualY(a," ")&&$opEqualY(y,"<"))) {
                                        $line=35;
                                        $result="<";
                                        if (true) break $try;
                                      }
                                      else {
                                        $line=36;
                                        if (($opEqualY(a," ")&&$opEqualY(y,">"))) {
                                          $line=36;
                                          $result=">";
                                          if (true) break $try;
                                        }
                                        else {
                                          $line=37;
                                          if (($opEqualY(a," ")&&$opEqualY(y,"+"))) {
                                            $line=37;
                                            $result="+";
                                            if (true) break $try;
                                          }
                                          else {
                                            $line=38;
                                            if (($opEqualY(a," ")&&$opEqualY(y,"-"))) {
                                              $line=38;
                                              $result="-";
                                              if (true) break $try;
                                            }
                                            else {
                                              $line=39;
                                              if (($opEqualY(a," ")&&$opEqualY(y,"*"))) {
                                                $line=39;
                                                $result="*";
                                                if (true) break $try;
                                              }
                                              else {
                                                $line=40;
                                                if (($opEqualY(a," ")&&$opEqualY(y,"/"))) {
                                                  $line=40;
                                                  $result="/";
                                                  if (true) break $try;
                                                }
                                                else {
                                                  $line=41;
                                                  if ($opEqualY(a," ")) {
                                                    $line=41;
                                                    $result="v";
                                                    if (true) break $try;
                                                  }
                                                  else {
                                                    $line=42;
                                                    $result="";
                                                    if (true) break $try;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=44;
      $rethrow(new RuntimeException("The function \"h(\u27E8x,y\u27E9:java.lang.Iterable,a:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Ej_tp3.class,"h",$line);
    }
    return $result;
  }
  public static Object g(java.lang.Iterable $v3, Object a) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object x=$v4.next();
      Object y=$v4.next();
      $line=47;
      if ($opEqualY(a," ")) {
        $line=47;
        $result="";
        if (true) break $try;
      }
      else {
        $line=49;
        $result=$opAdditY($invokeMethod(String.class,"valueOf",true,null,new Object[]{y}),$invokeMethod(String.class,"valueOf",true,null,new Object[]{a}));
        if (true) break $try;
      }
      $line=52;
      $rethrow(new RuntimeException("The function \"g(\u27E8x,y\u27E9:java.lang.Iterable,a:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Ej_tp3.class,"g",$line);
    }
    return $result;
  }
}
