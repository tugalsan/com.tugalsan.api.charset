module com.tugalsan.api.charset {
    requires javax.servlet.api;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.executable;
    exports com.tugalsan.api.charset.client;
    exports com.tugalsan.api.charset.server;
}