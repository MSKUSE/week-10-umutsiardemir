public abstract class StackLinkedList implements Stack {
   StackItem top = null;

   public StackItem getTop() {
      return top;
   }

   public void setTop(StackItem top) {
      this.top = top;
   }

   public StackLinkedList(StackItem top) {
      this.top = top;
   }

   public void push(StackItem item) {

   }
   public StackItem pop() {
      return null;
   }
   public StackItem top() {
      return top;
   }

   public Object pop(){
      return null;
   }
   public void push(Object item) {
      StackItem temp_box = new StackItem();
      StackItem previous_top = top;
      top = temp_box;
      top.setNext(previous_top);
   }
   public Object pop(){
      Object data =
   }
}






