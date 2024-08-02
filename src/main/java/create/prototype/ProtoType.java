package create.prototype;

import java.io.*;

public class ProtoType implements Cloneable{
    //任意名字 clone()
    protected Object copy() throws CloneNotSupportedException {
        return super.clone();
    }


    protected Object deepClone() throws  IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
