/**
 * 
 */
package com.ayue.prototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019年2月25日
 *
 * @author ayue
 */
public class PrototypeManager {
        //记录原型实例
        private static Map<String, Prototype> map = new HashMap<String, Prototype>();

        //私有化创建方法，避免外部创建实例
        private PrototypeManager() {
        };

        public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
                map.put(prototypeId, prototype);
        }

        public synchronized static void removePrototype(String prototypeId) {
                map.remove(prototypeId);
        }

        public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
                Prototype prototype = map.get(prototypeId);
                if (prototype == null) {
                        throw new Exception("原型未注册或已经销毁");
                }
                return prototype;
        }
}
