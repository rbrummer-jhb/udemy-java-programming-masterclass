<h1>Flour Pack Problem</h1>
Write a method named <b>canPack</b> with three parameters of type <b>int</b> named <b>bigCount, smallCount, and goal</b>.

The parameter <b>bigCount</b> represents the count of big flour bags (5 kilos each).

The parameter <b>smallCount</b> represents the count of small flour bags (1 kilo each).

The parameter <b>goal</b> represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of <b>bigCount</b> and smallCount must be at least equal to the value of <b>goal</b>. The method should <b>return true</b> if it is possible to make a package with <b>goal</b> kilos of flour.

If the sum is greater than <b>goal</b>, ensure that only full bags are used towards the goal amount. For example, if <b>goal</b> = 9, <b>bigCount</b> = 2, and <b>smallCount</b> = 0, the method should return <b>false</b> since each big bag is 5 kilos and cannot be divided. However, if <b>goal</b> = 9, <b>bigCount</b> = 1, and <b>smallCount</b> = 5, the method should <b>return true</b> because of <b>1 full bigCount</b> bag and <b>4 full smallCount</b> bags equal <b>goal</b>, and it's okay if there are additional bags left over.

If any of the parameters are negative, <b>return false</b>.


<b>EXAMPLE INPUT/OUTPUT:</b>

* ```canPack (1, 0, 4);``` should <b>return false</b> since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

* ```canPack (1, 0, 5);``` should <b>return true</b> since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

* ```canPack (0, 5, 4);``` should <b>return true</b> since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have <b>1 bag left which is ok</b> as mentioned above.

* ```canPack (2, 2, 11);``` should <b>return true</b> since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

* ```canPack (-3, 2, 12);``` should <b>return false</b> since bigCount is negative.


<b>NOTE:</b> The method <b>canPack</b> should be defined as <b>public static</b> like we have been doing so far in the course.

<b>NOTE:</b> Do not add a <b>main</b> method to the solution code.