# Minimum rotations to unlock a circular lock
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Given a lock made up of N different circular rings. Each ring has 0-9 digit printed&nbsp;on it. There is only one particular code which can open the lock.&nbsp;You can rotate each ring any number of times in either direction. Given the random sequence R and the&nbsp;desired sequence D, find the minimum number of rotations required to open the lock.&nbsp;</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre style="position: relative;"><span style="font-size:18px"><strong>Input:</strong> R = 222, D = 333
<strong>Output:</strong> 2
<strong>Explaination:</strong> Optimal number of rotations for 
getting 3 from 2 is 1. There are three 2 to 3 
transformations. So answer is 1+1+1 = 3.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre style="position: relative;"><span style="font-size:18px"><strong>Input:</strong> R = 2345, D = 5432
<strong>Output:</strong> 8
<strong>Explaination:</strong> The optimal shifts for pairs are: 
(2, 5) = 3, (3, 4) = 1, (4,3) = 1, (5,2) = 3. 
So total shifts = 3+1+1+3 = 8.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>rotationCount()</strong> which takes R and D&nbsp;as input parameters and return the minimum number of rotations required to make R = D.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(logR)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ R, D &lt; 10<sup>18</sup></span></p>
 <p></p>
            </div>