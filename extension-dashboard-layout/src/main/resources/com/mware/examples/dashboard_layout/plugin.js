require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.web.dashboard.layout', [
        {
            extensionId: 'com.mware-examples-dashboard-item-react',
            configuration: { metrics: { x: 5, y: 0, width: 4, height: 3 } }
        },
        {
            extensionId: "com.mware-web-notifications",
            configuration: { metrics :{ x: 9, y: 0, width: 3, height: 3 } }
        }
    ]);

});
