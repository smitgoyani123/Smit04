#include <iostream>
#include <algorithm>
using namespace std;
class CharStack {
public:
    char *As;
    int topidx;
    int size;
    CharStack() {
        topidx = -1;
        size = 1;
        As = new char[size];
    }
    
    void push(char x) {
        if(topidx>=size -1){
            size++;
            char* newArr = new char[size];
            for(int i = 0;i<=topidx;i++)
                newArr[i] = As[i];
            delete[] As;
            As = newArr;
        }
        topidx++;
        As[topidx] = x; 
    }
    
    int pop() {
        if(topidx < 0)
            return '\0';
        else
            return As[topidx--];
    }
    
    int top() {
        if(topidx < 0)
            return '\0';
        else
            return As[topidx]; 
    }
    
    bool isEmpty() {
        if(topidx==-1)
            return true;
        else
            return false;
    }
    ~CharStack(){delete[] As;}
};
int prec(char syb){
    switch(syb){
        case '(':
            return 1;
        case ')':
            return 2;
        case '+':
        case '-':
            return 3;
        case '*':
        case '/':
        case '%':
            return 4;
        case '^':
            return 5;
        default:
            return 0;

    }
}
string strreverse(string str){
    char temp;
    int n =str.length();
    for(int i=0;i<n/2;i++){
        if(str[i] == '('){
            temp = str[i];
            str[i] = str[n-i-1];
            str[n-i-1] = ')';
        }else if(str[i] == ')'){
            temp = str[i];
            str[i] = str[n-i-1];
            str[n-i-1] = '(';
        }else{
            temp = str[i];
            str[i] = str[n-i-1];
            str[n-i-1] = temp;
        }
    }
    cout<<str<<endl;
    return str;
}
string infixTopostfix(string s){
    int i=0;
    CharStack st;
    string ans;
   
    while(i<s.length()){
        if((s[i] >= 'A' && s[i]<='Z') || (s[i] >= 'a' && s[i]<='z') || (s[i] >= '0' && s[i]<='9')){
            ans+=s[i];
        }else if(s[i] == '(')
            st.push(s[i]);
        else if(s[i] == ')') {
            while (!st.isEmpty() && st.top() != '(')
            {
                ans += st.top();
                st.pop();
            }
            st.pop();
        } 
        else{
            while(!st.isEmpty() && prec(s[i])<=prec(st.top())){
                ans += st.top();
                st.pop();
            }
            st.push(s[i]);
        }
        i++;
    }
    while (!st.isEmpty())
    {
        ans+=st.top();
        st.pop();
    }
   
    return ans;
}
string infixToPrefix(string s) {
    // Step 1: reverse string
    reverse(s.begin(), s.end());

    // Step 2: swap brackets
    for (char &c : s) {
        if (c == '(') c = ')';
        else if (c == ')') c = '(';
    }

    // Step 3: get postfix of reversed
    string postfix = infixTopostfix(s);

    // Step 4: reverse postfix → prefix
    reverse(postfix.begin(), postfix.end());

    return postfix;
}
int main(){
   
    string s = "(A+B)*C-D+F";
    
    string str = infixToPrefix(s);
    cout<< str;

    
    return 0;
}