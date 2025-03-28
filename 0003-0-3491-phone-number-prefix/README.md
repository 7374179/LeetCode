<h2> 3 0
3491. Phone Number Prefix</h2><hr><div><p>You are given a string array <code>numbers</code> that represents phone numbers. Return <code>true</code> if no phone number is a prefix of any other phone number; otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">numbers = ["1","2","4","3"]</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>

<p><strong>Explanation:</strong></p>

<p>No number is a prefix of another number, so the output is <code>true</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">numbers = ["001","007","15","00153"]</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>

<p><strong>Explanation:</strong></p>

<p>The string <code>"001"</code> is a prefix of the string <code>"00153"</code>. Thus, the output is <code>false</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= numbers.length &lt;= 50</code></li>
	<li><code>1 &lt;= numbers[i].length &lt;= 50</code></li>
	<li>All numbers contain only digits <code>'0'</code> to <code>'9'</code>.</li>
</ul>
</div>