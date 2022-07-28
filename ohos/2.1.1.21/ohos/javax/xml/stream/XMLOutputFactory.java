/*     */ package ohos.javax.xml.stream;
/*     */ 
/*     */ import java.io.OutputStream;
/*     */ import java.io.Writer;
/*     */ import ohos.javax.xml.transform.Result;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class XMLOutputFactory
/*     */ {
/*     */   public static final String IS_REPAIRING_NAMESPACES = "javax.xml.stream.isRepairingNamespaces";
/*     */   
/*     */   protected XMLOutputFactory() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static XMLOutputFactory newInstance() throws FactoryConfigurationError {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static XMLOutputFactory newFactory() throws FactoryConfigurationError {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static XMLInputFactory newInstance(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static XMLOutputFactory newFactory(String factoryId, ClassLoader classLoader) throws FactoryConfigurationError {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public abstract XMLStreamWriter createXMLStreamWriter(Writer paramWriter) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLStreamWriter createXMLStreamWriter(OutputStream paramOutputStream) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLStreamWriter createXMLStreamWriter(OutputStream paramOutputStream, String paramString) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLStreamWriter createXMLStreamWriter(Result paramResult) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLEventWriter createXMLEventWriter(Result paramResult) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLEventWriter createXMLEventWriter(OutputStream paramOutputStream) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLEventWriter createXMLEventWriter(OutputStream paramOutputStream, String paramString) throws XMLStreamException;
/*     */   
/*     */   public abstract XMLEventWriter createXMLEventWriter(Writer paramWriter) throws XMLStreamException;
/*     */   
/*     */   public abstract void setProperty(String paramString, Object paramObject) throws IllegalArgumentException;
/*     */   
/*     */   public abstract Object getProperty(String paramString) throws IllegalArgumentException;
/*     */   
/*     */   public abstract boolean isPropertySupported(String paramString);
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/javax/xml/stream/XMLOutputFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */