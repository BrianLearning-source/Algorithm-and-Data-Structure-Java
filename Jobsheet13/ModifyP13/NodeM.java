package ModifyP13;

public class NodeM {
    StudentM data;
    NodeM prev;
    NodeM next;

    NodeM() {
    
    }

    NodeM (StudentM data) {
        this.data = data;
        prev = null; 
        next = null;
    }
    
    NodeM (NodeM prev, StudentM data, NodeM next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
