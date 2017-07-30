package test.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
	
	public static List<List<Integer>> subsets(List<Integer> list){
		
		if(list.isEmpty()){
			List<List<Integer>> ans = new ArrayList<>();
			ans.add(Collections.EMPTY_LIST);
			return ans;
		}
		Integer first = list.get(0);
		List<Integer> sublist = list.subList(1, list.size());
		List<List<Integer>> subset = subsets(sublist);
		List<List<Integer>> subset2 = insertAll(first,subset);
		return concat(subset,subset2);
	}
	
	public static List<List<Integer>> insertAll(Integer first, List<List<Integer>> sublist){
		
		List<List<Integer>> resultList = new ArrayList<>();
		for(List<Integer> li :sublist){
			List<Integer> templi = new ArrayList<>();
			templi.add(first);
			templi.addAll(li);
			resultList.add(templi);
		}
		return resultList;
	}
	
	public static List<List<Integer>>  concat(List<List<Integer>> first, List<List<Integer>> second){
		List<List<Integer>>  resultList = new ArrayList<>(first);
		resultList.addAll(second);
		
		return resultList;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(subsets(list));

	}

}
