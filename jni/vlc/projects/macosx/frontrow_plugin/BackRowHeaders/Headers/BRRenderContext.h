/*
 *     Generated by class-dump 3.1.1.
 *
 *     class-dump is Copyright (C) 1997-1998, 2000-2001, 2004-2006 by Steve Nygard.
 */

#import "NSObject.h"

@class BRRenderPixelFormat;

@interface BRRenderContext : NSObject
{
    BRRenderPixelFormat *_format;
    BRRenderContext *_shared;
    struct _CGLContextObject *_context;
}

- (id)initWithPixelFormat:(id)fp8 sharedContext:(id)fp12;
- (id)pixelFormat;
- (struct _CGLContextObject *)CGLContext;
- (void)dealloc;

@end
