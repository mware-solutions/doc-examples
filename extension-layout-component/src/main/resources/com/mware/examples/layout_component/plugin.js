require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.layout.component', {
        identifier: 'org.bigconnect.layout.body',
        children: [
            {
                ref: 'org.bigconnect.layout.text',
                model: 'Example of text layout component with fixed string',
                className: 'examples-layout_component-subheader'
            },
            { componentPath: 'detail/properties/properties', className: 'org-bigconnect-properties', modelAttribute: 'data' },
            { componentPath: 'comments/comments', className: 'org-bigconnect-comments', modelAttribute: 'data' },
            { componentPath: 'detail/relationships/relationships', className: 'org-bigconnect-relationships', modelAttribute: 'data' },
            { componentPath: 'detail/text/text', className: 'org-bigconnect-texts' }
        ]
    });


    bc.registry.registerExtension('org.bigconnect.layout.component', {
        applyTo: {
            constraints: ['width', 'height'],
            contexts: ['popup']
        },
        identifier: 'org.bigconnect.layout.body',
        children: [
            {
                componentPath: 'com/mware/examples/layout_component/popupBody',
                className: 'examples-layout_component-popupbody'
            }
        ]
    });
});
