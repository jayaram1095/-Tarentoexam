/*Program 2:
- Accept a String input
- Accept a String of valid chars
- Remove all the characters that are not present in the valid chars from the input string
- Print the cleansed String and the count of characters removed
*/
#include <bits/stdc++.h> 
using namespace std; 
  
// function to remove characters and 
// print new string 
void removeSpecialCharacter(string s) 
{ 
    string s1;
    for (int i = 0; i < s.size(); i++) { 
          
        // Finding the character whose  
        // ASCII value fall under this 
        // range 
        if (s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z')  
        {    
            if(s[i]==' ')
            {
                continue;
            }
            // erase function to erase  
            // the character 
            s1=s1+s[i];
            s.erase(i, 1);  
            i--; 
        } 
    } 
    cout << s<<"\n";
   // cout<<s1;
unordered_map<char, int> M; 
for (int i = 0; s1[i]; i++) { 
  
        // tofind charecter frequency
        if (M.find(s1[i]) == M.end()) { 
            M.insert(make_pair(s1[i], 1)); 
        } 
  
        // Else update the frequency 
        else { 
            M[s1[i]]++; 
        } 
    } 
 for (auto& it : M) { 
        cout << it.first << ' '
             << it.second<<" was removed" << '\n'; 
    } 
  
} 
  
// driver code 
int main() 
{ 
    string s;
     cout << "Enter a string: ";
    getline(cin, s);
    removeSpecialCharacter(s);  
    return 0; 
} 