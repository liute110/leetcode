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
		
		while(len>1)//���ڡ����֡�˼�����������������
		{
			int mid=(len+1)/2;//����
		    for(int i=0;i<len/2;i++)
		    {
		    	lists[i]=mergeTwoLists(lists[i],lists[i+mid]);
		    }
		    len=mid;
		}
		return lists[0];
	}
	//�����������ϣ�L1��L2Ϊͷ��㣬�鲢����ĺ���˼��
	public ListNode mergeTwoLists(ListNode L1,ListNode L2)
	{
		if(L1==null)return L2;
		if(L2==null)return L1;
		
		ListNode head=new ListNode(0);//������������ͷ����ʼ��
		ListNode phead=head;
		
		while(L1!=null&&L2!=null)//��������鲢����
		{
			if(L1.val <=L2.val)
			{
				phead.next=L1;//����������
				phead=phead.next;//�ƶ�ָ��
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
		
		return head.next;//��ʼ���ĵ�һ���ڵ㲻���ڽ��
	}
    

}
