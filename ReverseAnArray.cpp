/*

Question Link - https://practice.geeksforgeeks.org/problems/reverse-an-array/

Given an array A of size N, print the reverse of it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, in a new line, print the array in reverse order.
*/

#include <iostream>
using namespace std;

int main() {
	//code
	int i,j,t,n;
	cin>>t;
	for(i=0;i<t;i++)
	{
	    cin>>n;
	    int arr[n];
	    for(j=0;j<n;j++)
	        cin>>arr[j];
	    for(j=n-1;j>=0;j--)
	        cout<<arr[j]<<" ";
	    cout<<endl;
	}
	return 0;
}
