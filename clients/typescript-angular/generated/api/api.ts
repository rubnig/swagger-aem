export * from './console.service';
import { ConsoleService } from './console.service';
export * from './cq.service';
import { CqService } from './cq.service';
export * from './crx.service';
import { CrxService } from './crx.service';
export * from './custom.service';
import { CustomService } from './custom.service';
export * from './granite.service';
import { GraniteService } from './granite.service';
export * from './sling.service';
import { SlingService } from './sling.service';
export const APIS = [ConsoleService, CqService, CrxService, CustomService, GraniteService, SlingService];
