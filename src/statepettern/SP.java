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
public class SP {//보급
    State sOS;      //보급품이 없음     
     State nRQS;      //보급 요청이 없음
      State hRQS;      //보급 요청이 있음
       State sS;         // 보급품 있음
       
       
        State state =sOS;  //처음상태는 보급품없음이다
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
        String a = "보급품 전달\n";
        if(count !=0){
            count = count -1;
        }
        //보급품을 전달하면 보급품숫자가 하나씩 사라진다
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
        //현제 보급품(면도기)숫자를 보여준다
        @Override
        public String toString(){
         StringBuilder result =new StringBuilder();
        // result.append("\nA");
        // result.append("\nB");
         result.append("남은 보급품숫자:"+count+"(면도기)");
         if(count !=1){
         result.append("개");
         }
         result.append("\n");
         result.append("보급상태: "+state+"\n");
         return result.toString();
         
        }

    State getNRQState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        }