#include<stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int size,i;
        scanf("%d",&size);
        int arr[size];
        for(i=0;i<size;i++)
            scanf("%d",&arr[i]);
            int head, count; 
            head=arr[0]; 
            count=1;  
            for(i=1; i<size; i++)  
            {  
                if(head == arr[i])  
                count++;  
                else if(count == 1) 
                head=arr[i];  
                else  
                count-- ; 
            }  
            count=0;  
            for(i=0; i<size; i++)  
            {  
            if(arr[i] == head)  
            count++;  
            }  
             if(count >  size/2) 
            printf("YES %d\n", head);  
              else  
            printf("NO\n"); 
        printf("\n");
    }
    return 0;
}
 
