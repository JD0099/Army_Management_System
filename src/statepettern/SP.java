/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepettern;

/**
 *
 * @author im
 */
public class SP {//����
    State sOS;      //����ǰ�� ����     
     State nRQS;      //���� ��û�� ����
      State hRQS;      //���� ��û�� ����
       State sS;         // ����ǰ ����
       
       
        State state =sOS;  //ó�����´� ����ǰ�����̴�
        int count =0;
        
        public SP(int nSP){
        sOS=new SOState(this);
        nRQS = new NRQState(this);
        hRQS = new HRQState(this);
        sS =new SState(this);
        
        this.count = nSP;
        if (nSP > 0){
        state= nRQS;
        }
        }
        public String reQ(){
        return state.reQ();
        
        }
        public String reJ(){
        return state.reJ();
        }
        public String id(){
        return state.id() + state.ds();
        }
        void setState(State state){
        this.state= state;
        }
        
        String releaseS(){
        String a = "����ǰ ����\n";
        if(count !=0){
            count = count -1;
        }
        //����ǰ�� �����ϸ� ����ǰ���ڰ� �ϳ��� �������
        return a;
        }
        int getCount(){
        return count;
        }
        void refill(int count){
        this.count=count;
        state=nRQS;
        }
        public State getState(){
        return state;
        }
        public State getSOState(){
        State nRQS = null;
        return nRQS;
        }
        public State getHRQState(){
        return sS;
        }
        //���� ����ǰ(�鵵��)���ڸ� �����ش�
        @Override
        public String toString(){
         StringBuilder result =new StringBuilder();
        // result.append("\nA");
        // result.append("\nB");
         result.append("���� ����ǰ����:"+count+"(�鵵��)");
         if(count !=1){
         result.append("��");
         }
         result.append("\n");
         result.append("���޻���: "+state+"\n");
         return result.toString();
         
        }

    State getNRQState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        }