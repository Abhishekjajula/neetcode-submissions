public class Node{
         int key;
         int value;
         Node prev;
         Node next;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    
class LRUCache { 
    private HashMap<Integer,Node> cache; 
    private int capacity;
    private Node left;
    private Node right; 

    public LRUCache(int capacity) { 
        this.capacity = capacity; 
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0); 
        this.left.next = this.right;
        this.right.prev = this.left;
    } 

    public void insert(Node node){
        this.right.prev.next = node;
        node.prev = this.right.prev;
        node.next = this.right;
        this.right.prev = node;
        } 

    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public int get(int key) { 
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        } 
        return -1;
    } 

    public void put(int key, int value) { 
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key,value);
        cache.put(key,newNode); 

        insert(newNode);
        
        if (cache.size() > capacity) { 
            cache.remove(this.left.next.key);

            remove(this.left.next);
        } 
    }

}
