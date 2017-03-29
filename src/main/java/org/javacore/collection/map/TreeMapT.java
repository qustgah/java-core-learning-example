package org.javacore.collection.map;

import java.util.Map;
import java.util.TreeMap;
/*
 * Copyright [2015] [Jeff Lee]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jeff Lee
 * @since 2015-6-18 21:36:04
 * 	TreeMap 的使用
 *
 * 	1、TreeMap如不指定排序器，默认将按照key值进行升序排序，如果指定了排序器，则按照指定的排序器进行排序。
 *  2、具体的排序规则，开发人员可以在int compare()方法中进行指定。
 */
public class TreeMapT
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		Map map = new TreeMap();
		map.put("1", "1");
		map.put("4", "4");
		map.put("2", "2");
		map.put("2", "3");
		// 注意排序
		System.out.println(map);
	}
}
