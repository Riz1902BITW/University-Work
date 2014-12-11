{"filter":false,"title":"Quicks.java","tooltip":"/210CT_Programming/Portfolio/Item_3/6_Code/Quicks.java","undoManager":{"mark":51,"position":51,"stack":[[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":71,"column":0},"action":"insert","lines":["package com.Quicks;","","import java.util.ArrayList;","import java.util.List;","import java.util.Random;","","","public class QuickSort {","","    public static int count=0;","   public static Random r = new Random();","    public static void main(String[] args) {","","","        List<Integer> a = new ArrayList<Integer>();","","","        for (int i = 0; i < 512; i++) {","            a.add(r.nextInt(1000));","        }","        sort(a);","        System.out.println(a);","        System.out.println(count);","","    }","","    public static void sort(List<Integer> items) {","","        //If there is  1 or less elements in the list, Do nothing.","        if (items.size() > 1) {","            List<Integer> smaller = new ArrayList<Integer>();","            List<Integer> same = new ArrayList<Integer>();","            List<Integer> larger = new ArrayList<Integer>();","","            Integer pivot = items.get(items.size() / 2);","","            for (int i : items) {","                if (i < pivot) {","                    smaller.add(i);","                    count++;","                } else if (i > pivot) {","                    larger.add(i);","                    count++;","                } else {","                    same.add(i);","                   count++;","","                }","            }","                sort(smaller);","                sort(larger);","","                items.clear();","                items.addAll(smaller);","                items.addAll(same);","                items.addAll(larger);","","","        }","    }","","","","}","","","","","","","",""]}]}],[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":0,"column":19},"action":"remove","lines":["package com.Quicks;"]}]}],[{"group":"doc","deltas":[{"start":{"row":7,"column":21},"end":{"row":7,"column":22},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":7,"column":20},"end":{"row":7,"column":21},"action":"remove","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":7,"column":19},"end":{"row":7,"column":20},"action":"remove","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":7,"column":18},"end":{"row":7,"column":19},"action":"remove","lines":["S"]}]}],[{"group":"doc","deltas":[{"start":{"row":7,"column":18},"end":{"row":7,"column":19},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":27},"end":{"row":22,"column":28},"action":"insert","lines":["\""]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":28},"end":{"row":22,"column":29},"action":"insert","lines":["T"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":29},"end":{"row":22,"column":30},"action":"insert","lines":["O"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":30},"end":{"row":22,"column":31},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":30},"end":{"row":22,"column":31},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":29},"end":{"row":22,"column":30},"action":"remove","lines":["O"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":28},"end":{"row":22,"column":29},"action":"remove","lines":["T"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":28},"end":{"row":22,"column":29},"action":"insert","lines":["\""]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":28},"end":{"row":22,"column":29},"action":"insert","lines":["T"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":29},"end":{"row":22,"column":30},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":30},"end":{"row":22,"column":31},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":31},"end":{"row":22,"column":32},"action":"insert","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":32},"end":{"row":22,"column":33},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":33},"end":{"row":22,"column":34},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":34},"end":{"row":22,"column":35},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":35},"end":{"row":22,"column":36},"action":"insert","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":36},"end":{"row":22,"column":37},"action":"insert","lines":["m"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":37},"end":{"row":22,"column":38},"action":"insert","lines":["b"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":38},"end":{"row":22,"column":39},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":39},"end":{"row":22,"column":40},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":40},"end":{"row":22,"column":41},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":41},"end":{"row":22,"column":42},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":42},"end":{"row":22,"column":43},"action":"insert","lines":["f"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":43},"end":{"row":22,"column":44},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":44},"end":{"row":22,"column":45},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":45},"end":{"row":22,"column":46},"action":"insert","lines":["w"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":46},"end":{"row":22,"column":47},"action":"insert","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":47},"end":{"row":22,"column":48},"action":"insert","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":48},"end":{"row":22,"column":49},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":49},"end":{"row":22,"column":50},"action":"insert","lines":[":"]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":50},"end":{"row":22,"column":51},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":22,"column":52},"end":{"row":22,"column":53},"action":"insert","lines":["+"]}]}],[{"group":"doc","deltas":[{"start":{"row":10,"column":41},"end":{"row":11,"column":0},"action":"insert","lines":["",""]},{"start":{"row":11,"column":0},"end":{"row":11,"column":3},"action":"insert","lines":["   "]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":38},"end":{"row":35,"column":54},"action":"remove","lines":["items.size() / 2"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":38},"end":{"row":35,"column":39},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":39},"end":{"row":35,"column":40},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":40},"end":{"row":35,"column":41},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":41},"end":{"row":35,"column":42},"action":"insert","lines":["m"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":42},"end":{"row":35,"column":43},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":42},"end":{"row":35,"column":43},"action":"remove","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":41},"end":{"row":35,"column":42},"action":"remove","lines":["m"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":40},"end":{"row":35,"column":41},"action":"remove","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":39},"end":{"row":35,"column":40},"action":"remove","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":38},"end":{"row":35,"column":39},"action":"remove","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":35,"column":38},"end":{"row":35,"column":39},"action":"insert","lines":["0"]}]}]]},"ace":{"folds":[],"scrolltop":240,"scrollleft":0,"selection":{"start":{"row":35,"column":39},"end":{"row":35,"column":39},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416868547000,"hash":"818590f6eae37204c93d4fa85192f5b248871e1d"}