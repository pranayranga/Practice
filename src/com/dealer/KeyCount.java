package com.dealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class KeyCount {

	public static void main(String[] args) {

		Path path = FileSystems.getDefault().getPath(
				"/Users/pranayranga/workspace/Practice/src/com/dealer/test",
				"test.txt");
		Map<String, Integer> nameMap = new HashMap<String, Integer>();

		try {
			BufferedReader reader = Files.newBufferedReader(path,
					StandardCharsets.UTF_8);
			String line;
			
			
			while ((line = reader.readLine()) != null) {
				String[] strArr = line.split(",");
				int i = Integer.parseInt(strArr[1].trim());
				String name = strArr[0].trim();
				if (nameMap.get(name) != null) {
					nameMap.put(name.trim(), nameMap.get(name) + i);
				}
				else
				{  
					nameMap.put(name,i);

				}
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Map.Entry<String, Integer> entry : nameMap.entrySet())
		{
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
