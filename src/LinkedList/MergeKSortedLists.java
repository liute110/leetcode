package LinkedList;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public ListNode mergeKLists(ListNode[] lists)
	{
		int len=lists.length;
		
		if(lists==null||len==0)
			return null;
		if(len==1)
			return lists[0];
		
		while(len>1)//基于“二分”思想进行链表的两两组合
		{
			int mid=(len+1)/2;//二分
		    for(int i=0;i<len/2;i++)
		    {
		    	lists[i]=mergeTwoLists(lists[i],lists[i+mid]);
		    }
		    len=mid;
		}
		return lists[0];
	}
	//有序链表的组合，L1和L2为头结点，归并排序的核心思想
	public ListNode mergeTwoLists(ListNode L1,ListNode L2)
	{
		if(L1==null)return L2;
		if(L2==null)return L1;
		
		ListNode head=new ListNode(0);//保存结果的链表，头结点初始化
		ListNode phead=head;
		
		while(L1!=null&&L2!=null)//两个链表归并排序
		{
			if(L1.val <=L2.val)
			{
				phead.next=L1;//接入结果链表
				phead=phead.next;//移动指针
				L1=L1.next;
			}
			else
			{
				phead.next=L2;
				phead=phead.next;
				L2=L2.next;
			}
		}
		if(L1!=null)
			phead.next=L1;
		else
			phead.next=L2;
		
		return head.next;//初始化的第一个节点不属于结果
	}
    

}
