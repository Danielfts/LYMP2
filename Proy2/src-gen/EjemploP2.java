// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/EjemploP2.gold"
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
public final class EjemploP2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static Object B=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=16;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=18;
      A=$fix($opIntvlY('a','z'));
      $line=19;
      B=$fix($opIntvlY('0','9'));
      $line=20;
      Object coder=$fix($invokeMethod(EjemploP2.class,"createCoder",true,null,new Object[]{}));
      $line=21;
      Object deCoder=$fix($invokeMethod(EjemploP2.class,"createDecoder",true,null,new Object[]{}));
      $line=29;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=34;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object val:GCollections.unmodifiableCollection(GCollections.asSet('0','1'))) {
        for (Object endi:GCollections.unmodifiableCollection($opIntvlY('0','1'))) {
          for (Object dips:GCollections.unmodifiableCollection($opIntvlY(0,4))) {
            for (Object no:GCollections.unmodifiableCollection($opIntvlY(0,2))) {
              $v1.add(GCollections.asList(dips,no,endi,val));
            }
          }
        }
      }
      Object Q=$fix($opUnionY($v1,GCollections.asSet("err")));
      $line=35;
      Object \u03A3=$fix($opUnionY($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ')),GCollections.asSet('$')));
      $line=36;
      Object \u03A3_=$fix($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opIntvlY('a','z'),$opIntvlY('0','2')),GCollections.asSet('#')),GCollections.asSet('*')),GCollections.asSet('@')),GCollections.asSet('$')));
      $line=38;
      Object q_0=$fix(GCollections.asList(4,1,'0','0'));
      $line=39;
      gold.structures.set.ISet $v3=$newSet();
      $v4:for (Object disp:GCollections.unmodifiableCollection($opIntvlY(0,4))) {
        for (Object no:GCollections.unmodifiableCollection($opIntvlY(0,2))) {
          $v3.add(GCollections.asList(disp,no,'1','1'));
        }
      }
      Object F=$fix($v3);
      $line=41;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(EjemploP2.class,"\u03B4"),new GMethod(EjemploP2.class,"g"),new GMethod(EjemploP2.class,"h")});
      if (true) break $try;
      $line=42;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=45;
      $result="err";
      if (true) break $try;
      $line=46;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v5, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object dips=$v6.next();
      Object no=$v6.next();
      Object endi=$v6.next();
      Object val=$v6.next();
      $line=49;
      if ($opEqualY(input,'$')) {
        $line=49;
        $result=GCollections.asList(dips,no,'1',val);
        if (true) break $try;
      }
      else {
        $line=50;
        if ($opEqualY(input,' ')) {
          $line=51;
          if ($opEqualY(val,'1')) {
            $line=51;
            $result=GCollections.asList(4,1,'0','0');
            if (true) break $try;
          }
          else {
            $line=52;
            $result="err";
            if (true) break $try;
          }
        }
        else {
          $line=54;
          if ($opMembrY(input,$opIntvlY('a','z'))) {
            $line=55;
            if ($opLesstY($opSubtrY(dips,1),0)) {
              $line=56;
              if ($opGreaqY($opAdditY(no,1),3)) {
                $line=56;
                $result=GCollections.asList(3,0,'0','1');
                if (true) break $try;
              }
              else {
                $line=57;
                $result=GCollections.asList(3,$opAdditY(no,1),'0','1');
                if (true) break $try;
              }
            }
            else {
              $line=59;
              $result=GCollections.asList($opSubtrY(dips,1),no,'0','1');
              if (true) break $try;
            }
          }
          else {
            $line=62;
            $result="err";
            if (true) break $try;
          }
        }
      }
      $line=64;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8dips,no,endi,val\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=69;
      $result="";
      if (true) break $try;
      $line=70;
      $rethrow(new RuntimeException("The function \"h(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v7, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v8=GCollections.unmodifiableCollection($v7).iterator();
      Object dips=$v8.next();
      Object no=$v8.next();
      Object endi=$v8.next();
      Object val=$v8.next();
      $line=73;
      if ($opMembrY(input,$opIntvlY('a','z'))) {
        $line=74;
        if ($opGreatY(dips,0)) {
          $line=74;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=75;
          $result=$opAdditY('@',$invokeMethod(String.class,"valueOf",true,null,new Object[]{input}));
          if (true) break $try;
        }
      }
      else {
        $line=77;
        if ($opEqualY(input,' ')) {
          $line=77;
          $result=$opAdditY($opAdditY($invokeMethod(EjemploP2.class,"number",true,null,new Object[]{'#',dips}),no),'*');
          if (true) break $try;
        }
        else {
          $line=78;
          if ($opEqualY(input,'$')) {
            $line=78;
            $result=$opAdditY($opAdditY($invokeMethod(EjemploP2.class,"number",true,null,new Object[]{'#',dips}),no),'$');
            if (true) break $try;
          }
          else {
            $line=79;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=83;
      $rethrow(new RuntimeException("The function \"h(\u27E8dips,no,endi,val\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=89;
      $result="";
      if (true) break $try;
      $line=90;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=95;
      gold.structures.set.ISet $v9=$newSet();
      $v10:for (Object ar:GCollections.unmodifiableCollection(GCollections.asSet('1','0'))) {
        for (Object hay:GCollections.unmodifiableCollection(GCollections.asSet('1','0'))) {
          for (Object fin:GCollections.unmodifiableCollection(GCollections.asSet('1','0'))) {
            for (Object size:GCollections.unmodifiableCollection($opIntvlY(0,4))) {
              for (Object almd:GCollections.unmodifiableCollection($opIntvlY(0,3))) {
                for (Object num:GCollections.unmodifiableCollection($opIntvlY(0,2))) {
                  $v9.add(GCollections.asList(size,almd,num,fin,hay,ar));
                }
              }
            }
          }
        }
      }
      Object Q=$fix($opUnionY($v9,GCollections.asSet("err")));
      $line=96;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY($opUnionY($opUnionY($opIntvlY('a','z'),$opIntvlY('0','2')),GCollections.asSet('#')),GCollections.asSet('*')),GCollections.asSet('@')),GCollections.asSet('$')));
      $line=97;
      Object \u03A3_=$fix($opUnionY($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ')),GCollections.asSet('$')));
      $line=98;
      Object q_0=$fix(GCollections.asList(0,0,1,'0','0','0'));
      $line=99;
      gold.structures.set.ISet $v11=$newSet();
      $v12:for (Object hay:GCollections.unmodifiableCollection(GCollections.asSet('1','0'))) {
        for (Object almd:GCollections.unmodifiableCollection($opIntvlY(0,3))) {
          $v11.add(GCollections.asList(4,almd,1,'1',hay,'1'));
        }
      }
      Object F=$fix($v11);
      $line=100;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(EjemploP2.class,"\u03B41"),new GMethod(EjemploP2.class,"g"),new GMethod(EjemploP2.class,"h1")});
      if (true) break $try;
      $line=101;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=105;
      $result=state;
      if (true) break $try;
      $line=106;
      $rethrow(new RuntimeException("The function \"\u03B41(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v13, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v14=GCollections.unmodifiableCollection($v13).iterator();
      Object size=$v14.next();
      Object almd=$v14.next();
      Object num=$v14.next();
      Object fin=$v14.next();
      Object hay=$v14.next();
      Object nu=$v14.next();
      $line=111;
      if ($opEqualY(input,'$')) {
        $line=111;
        $result=GCollections.asList(size,almd,num,'1',hay,nu);
        if (true) break $try;
      }
      else {
        $line=112;
        if ($opLesstY(size,4)) {
          $line=114;
          if ($opMembrY(input,$opIntvlY('a','z'))) {
            $line=114;
            $result=GCollections.asList($opAdditY(size,1),almd,num,'0',hay,'0');
            if (true) break $try;
          }
          else {
            $line=115;
            if ($opEqualY(input,'#')) {
              $line=117;
              if ($opGreatY($opAdditY(almd,1),3)) {
                $line=117;
                $result="err";
                if (true) break $try;
              }
              else {
                $line=118;
                $result=GCollections.asList($opAdditY(size,1),$opAdditY(almd,1),num,'0','1','0');
                if (true) break $try;
              }
            }
            else {
              $line=121;
              $result="err";
              if (true) break $try;
            }
          }
        }
        else {
          $line=124;
          if ($opEqualY(size,4)) {
            $line=126;
            if ($opEqualY(input,'*')) {
              $line=126;
              $result=GCollections.asList(0,0,1,'0','0','0');
              if (true) break $try;
            }
            else {
              $line=127;
              if ($opEqualY(input,'@')) {
                $line=128;
                if ($opEqualY(hay,'1')) {
                  $line=128;
                  $result="err";
                  if (true) break $try;
                }
                else {
                  $line=130;
                  if ($opGreaqY($opAdditY(num,1),3)) {
                    $line=130;
                    $result=GCollections.asList(0,almd,0,'0',hay,'0');
                    if (true) break $try;
                  }
                  else {
                    $line=131;
                    $result=GCollections.asList(0,almd,$opAdditY(num,1),'0',hay,nu);
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=136;
                if ($opMembrY(input,$opIntvlY('0','3'))) {
                  $line=138;
                  if ($opEqualY(Integer.parseInt($cast(java.lang.String.class,input)),num)) {
                    $line=138;
                    $result=GCollections.asList(size,almd,1,fin,hay,'1');
                    if (true) break $try;
                  }
                  else {
                    $line=139;
                    $result="err";
                    if (true) break $try;
                  }
                }
                else {
                  $line=142;
                  $result="err";
                  if (true) break $try;
                }
              }
            }
          }
          else {
            $line=145;
            $result="err";
            if (true) break $try;
          }
        }
      }
      $line=148;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8size,almd,num,fin,hay,nu\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=154;
      $result="";
      if (true) break $try;
      $line=155;
      $rethrow(new RuntimeException("The function \"h1(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v15, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v16=GCollections.unmodifiableCollection($v15).iterator();
      Object size=$v16.next();
      Object almd=$v16.next();
      Object num=$v16.next();
      Object fin=$v16.next();
      Object hay=$v16.next();
      Object nu=$v16.next();
      $line=159;
      if ($opEqualY(input,'$')) {
        $line=159;
        $result='$';
        if (true) break $try;
      }
      else {
        $line=160;
        if ($opMembrY(input,$opIntvlY('a','z'))) {
          $line=160;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=161;
          if ($opEqualY(input,'*')) {
            $line=161;
            $result=' ';
            if (true) break $try;
          }
          else {
            $line=162;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=165;
      $rethrow(new RuntimeException("The function \"h1(\u27E8size,almd,num,fin,hay,nu\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"h1",$line);
    }
    return $result;
  }
  public static Object number(Object c, Object n) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=169;
      n=$fix(Integer.parseInt($cast(java.lang.String.class,n)));
      $line=170;
      if ($opEqualY(n,0)) {
        $line=170;
        $result="";
        if (true) break $try;
      }
      else {
        $line=171;
        $result=$opAdditY($invokeMethod(String.class,"valueOf",true,null,new Object[]{c}),$invokeMethod(EjemploP2.class,"number",true,null,new Object[]{c,$opSubtrY(n,1)}));
        if (true) break $try;
      }
      $line=173;
      $rethrow(new RuntimeException("The function \"number(c:Object,n:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,EjemploP2.class,"number",$line);
    }
    return $result;
  }
}
