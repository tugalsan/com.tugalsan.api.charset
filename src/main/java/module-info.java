module com.tugalsan.api.charset {
    requires javax.servlet.api;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.log;
    requires com.tugalsan.api.executable;
    exports com.tugalsan.api.charset.client;
}