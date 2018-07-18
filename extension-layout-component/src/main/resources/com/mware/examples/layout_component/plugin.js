require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.layout.component', {
        identifier: 'com.mware.layout.body',
        children: [
            {
                ref: 'com.mware.layout.text',
                model: 'Example of text layout component with fixed string',
                className: 'examples-layout_component-subheader'
            },
            { componentPath: 'detail/properties/properties', className: 'com.mware-properties', modelAttribute: 'data' },
            { componentPath: 'comments/comments', className: 'com.mware-comments', modelAttribute: 'data' },
            { componentPath: 'detail/relationships/relationships', className: 'com.mware-relationships', modelAttribute: 'data' },
            { componentPath: 'detail/text/text', className: 'com.mware-texts' }
        ]
    });


    bc.registry.registerExtension('com.mware.layout.component', {
        applyTo: {
            constraints: ['width', 'height'],
            contexts: ['popup']
        },
        identifier: 'com.mware.layout.body',
        children: [
            {
                componentPath: 'com.mware/examples/layout_component/popupBody',
                className: 'examples-layout_component-popupbody'
            }
        ]
    });
});
